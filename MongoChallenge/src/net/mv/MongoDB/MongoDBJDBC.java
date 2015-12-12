package net.mv.MongoDB;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Date;


public class MongoDBJDBC {
	
	public static Date readingDate(Date d){
		MeterReading mr=new MeterReading();
		mr.setReadingTime(d);
		return mr.getReadingTime();
		
	}
	public static double readingKwh(double k){
		MeterReading mr=new MeterReading();
		mr.setKwh(k);
		return mr.getKwh();
		
	}
	

	public static void main(String[] args) {
		
		    try {
				MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
				 
  DB db = mongoClient.getDB( "newdb" );
  
  // Create Meter Collection and MeterReadings collection
  
				 DBCollection table = db.getCollection("Meter");
				 /*
				  * DELETE A DOCUMENT
				 DBObject myDoc = table.findOne();
		         table.remove(myDoc);
		         */
		        // INSERT DOCUMENTS-Fill up Meter and Meter Reading Collection
				
		         String[] idArr = {"a","b","c","d","e","f","g","h","i","j"};
		         String[] modelArr = {"ab","bc","cd","de","ef","fg","gh","hi","ij","jk"};
		         String[] addressArr = {"ab1","bc2","cd3","de4","ef5","fg6","gh7","hi8","ij9","jk0"};
				
				for(int n=0;n<10;n++){
					for(int m=0;m<24;m++){
					
					BasicDBObject document = new BasicDBObject();
					  
					document.put("meterId", idArr[n]);
					document.put("meterModel", modelArr[n]);
					document.put("installDate", new Date());
					document.put("address", addressArr[n]);
					
					
						Date date1=new Date();
						  double rnd = Math.random();
						  document.put("MeterReadingDate",MongoDBJDBC.readingDate(date1));
							document.put("Kwh",MongoDBJDBC.readingKwh(rnd));
							table.insert(document);
					}
					
				}
				
				 
				
			DBCursor cursor = table.find();
				 
		         int i=1;
		         while (cursor.hasNext()) { 
		            System.out.println("Inserted Document: "+i); 
		            System.out.println(cursor.next()); 
		            i++;
		         }
				
		         // Average of all meter a readings
		         
		         System.out.println("query on meter a");
		         
		         double[] kwhVals = new double[24];
		         int k=0;
		         BasicDBObject whereQuery = new BasicDBObject(); 
		         DBObject dock= table.findOne();
		     	whereQuery.put("meterId", "a");
		     	DBCursor cursor1 = table.find(whereQuery);
		     	while(cursor1.hasNext()) {
		     	    System.out.println(cursor1.next());
		     	    kwhVals[k] = (Double) dock.get( "Kwh" );
		     	    k=k+1;
		     	}
		     	double sum=0;
		     	for(int l=0;l<24;l++){
		     		sum=sum+kwhVals[l];
		     	}
		     	System.out.println("The average of kwh readings of meter a is "+sum/24);
				
		     	// Meter with the highest Kwh reading
		     	
		     	DBCursor cursor2 = table.find().sort( new BasicDBObject( "Kwh" , -1 ) ).limit(1);
		     	System.out.println("meter with highest Kwh reading");
		     	while(cursor2.hasNext()) {
		     	    System.out.println(cursor2.next());
		     	}
		     	// Modifying Kwh to new value(update on a Kwh value, the value is changed to 1.0)
		     	
		     	System.out.println("Modify Kwh to new value");
		     	BasicDBObject query1 = new BasicDBObject();
		    	query1.put("Kwh", 0.5751141918953353);

		    	BasicDBObject newDocument1 = new BasicDBObject();
		    	newDocument1.put("Kwh", 1.0);
		    				
		    	BasicDBObject updateObj = new BasicDBObject();
		    	updateObj.put("$set", newDocument1);

		    	table.update(query1, updateObj);
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}catch (MongoException e) {
				e.printStackTrace();
			}
	      }
	}


