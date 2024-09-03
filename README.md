here you will understand
-> reading and writing text file in java 
-> reading and writing binary file in java

File is a class in java
File myfile=new File("m.txt");
try{
    myfile.createNewFile();
}
catch(IO exception)
{   System.out.println("Unable to create file")
    e.printStacktrace();
}

note:: method create file thorows an io exception so need to surround it with try catch


// code to write a file
try{
FileWriter fileWriter=new fileWriter("filename")
fileWriter.write("content is this") // this will write the part in the file created by name filef
fileWriter,close()
}
catch(IO exception)
{   System.out.println("Unable to create file")
    e.printStacktrace();
}

bufferedreader class doesent have hasnextline() u need to use while((class.readline()!=null))


// reading a file
try{
File myfile= new File("path.txt")
while(sc.hasnextline()){
String line = sc.nextline();
System.out.println(line);
}
sc.close()
}
catch(IO exception)
{   System.out.println("Unable to create file")
    e.printStacktrace();
}

Scanner sc= new Scanner(myFile);



}
is syntax to create a new text file of name



Java Classes for Binary File Operations:

FileInputStream: Reads data from a binary file.
FileOutputStream: Writes data to a binary file.
BufferedInputStream: Provides buffered input for improved performance.
BufferedOutputStream: Provides buffered output for improved performance.
