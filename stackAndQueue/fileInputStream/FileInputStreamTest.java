import java.io.*;

//FileInputStreamTest reads a specified file as binary file 

class FileInputStreamTest
{
   public static void main(String[] args) throws IOException
   {  
      FileInputStream fis = null;
      int i=0;
      char c;
      
      try
      {  
         //create new file input stream
         fis = new FileInputStream("file.txt");
         
         //read till the end of the file
         
         /////// java.io.InputStream.read() method //////

         //reads the next byte of the data from the the input stream 
         //and returns int in the range of 0 to 255.
         //If no byte is available 
         //because the end of the stream has been reached, 
         //the returned value is -1.
         
         while ((i = fis.read())!=-1)                                     
         {
            /////  java.lang.Integer.toHexString() method  ///////
            //returns a string representation of the integer argument as an unsigned integer in base 16.
            //The following characters are used as hexadecimal digits:0123456789abcdef.
            
            //converts integer to character
            c = (char)i;
            
            //prints character
            System.out.print(c); 
         }
         
      }
      catch(Exception ex)
      {
         //if any I/O error occurs
         ex.printStackTrace();
      }
      finally
      {
         //releases all system resouces from the streams
         if(fis!=null)
            fis.close(); 
            
            //// java.io.FileOutputStream.close() method
      }
   }
}