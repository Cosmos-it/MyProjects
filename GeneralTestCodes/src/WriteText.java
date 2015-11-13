import java.io.*;
import java.util.*;

class WriteText
{


    public static void main(String[] args)
    {   
    	String[] names = { "Terminator", "Slicer","Ninja", "cow", "Robot", "littlegirl" };


    	String name = names[(int) (Math.random() * names.length)];
    	System.out.println(name);
    	
        try {
            String text = "Your sample content to save in a text file. test Another override!";
            BufferedWriter out = new BufferedWriter(new FileWriter("sample.txt"));
            out.write(text);
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("Exception ");       
        }

        return ;
    }
}

/*
ArrayList<String> message = new ArrayList<>();
message.add("Taban");
message.add("Taban Cosmost");
message.add("Last message");



WriteText.SaveFile("Test", message);
}

public static void SaveFile(String name, ArrayList<String> message) {

String path = "/Users/Taban/OneDrive/cs302/GeneralTestCodes/" + name + ".txt";

File file1 = new File(path);

try {

	if (!file1.exists()) {
		file1.createNewFile();
	}


	File[] files = file1.listFiles();


	FileWriter fw = new FileWriter(file1, true);

	BufferedWriter bw = new BufferedWriter(fw);

	for (int i = 0; i < message.size(); i++) {

		bw.write(message.get(i));
		bw.newLine();
	}

	bw.close();
	fw.close();

	FileReader fr = new FileReader(file1);

	BufferedReader br = new BufferedReader(fr);

	fw = new FileWriter(file1, true);

	bw = new BufferedWriter(fw);

	while (br.ready()) {

		String line = br.readLine();

		System.out.println(line);

		bw.write(line);
		bw.newLine();

	}
	br.close();
	fr.close();

} catch (IOException ex) {
	ex.printStackTrace();
}
}*/