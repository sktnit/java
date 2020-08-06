package DataReader.com;
import java.util.*;
import java.io.File;
import java.io.IOException;
public class DataReader {
	static void getAveByClass(List<String[]> rowList) {
		int count=0, count_iris_setosa=0, count_iris_versicolor=0,count_iris_virginica=0;
		String label_1="Iris-setosa";
		String label_2="Iris-versicolor";
		String label_3="Iris-virginica";
		String[][] avebyclass= new String[4][5];
		for(int i=0; i<4;i++)
			for(int j=0; j<5;j++)
				avebyclass[i][j]="0";
		for (String[] row : rowList) {
			if(count==0) {
			for(int i=0;i<row.length;i++)
				avebyclass[0][i]=row[i];
			count++;
			}
			else {
				String[] temp = row;
				for(int i=0;i<row.length;i++) {
					if(row[i].equalsIgnoreCase(label_1)) {
						count_iris_setosa++;
						for(int j=0;j<4;j++) {
							int x=Integer.valueOf(row[j]);
							int y=Integer.valueOf(avebyclass[1][j]);
							avebyclass[1][j]=String.valueOf(x+y);	
						}
					}
					if(row[i].equalsIgnoreCase(label_2)) {
						count_iris_versicolor++;
						for(int j=0;j<4;j++) {
							int x=Integer.valueOf(row[j]);
							int y=Integer.valueOf(avebyclass[2][j]);
							avebyclass[2][j]=String.valueOf(x+y);
						}
					}
					if(row[i].equalsIgnoreCase(label_2)) {
						count_iris_virginica++;
						for(int j=0;j<4;j++) {
							int x=Integer.valueOf(row[j]);
							int y=Integer.valueOf(avebyclass[3][j]);
							avebyclass[3][j]=String.valueOf(x+y);
					}
				}
		}}}
		for(int i=0; i<4;i++)
			for(int j=0;j<5;j++) 
				System.out.print(avebyclass[i][j]+" ");
//		System.out.println();
//		System.out.println(count_iris_setosa);
//		System.out.println(count_iris_versicolor);
//		System.out.println(count_iris_virginica);
}
	public static void main(String[] args) {
		String fileName = "C:\\Users\\HP\\workspace\\DataReader\\src\\DataReader\\com\\Text.txt";
		List<String[]> rowList = new ArrayList<String[]>();
		try {
			int i=0;
		      Scanner sc = new Scanner(new File(fileName));
		      while (sc.hasNext()) {
		        String[] str = sc.nextLine().split(" ");
		        rowList.add(str);
		      }
		      sc.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
//		for (String[] row : rowList) {
//			for (String r : row) {
//				System.out.print(r+" ");
//			}
//			System.out.println();
//		}
		getAveByClass(rowList);
}

}
