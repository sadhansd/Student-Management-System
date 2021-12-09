import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class markAnalyse 
{
  
	public void showbar(int a,int b,int c,int d,int e,int f,int g,int h,int i) {
                
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(a,"DSA","CAT-1");
                dataset.addValue(d,"DBMS","CAT-1");
                dataset.addValue(g,"JAVA","CAT-1");
                
		dataset.addValue(b,"DSA","CAT-2");
                dataset.addValue(e,"DBMS","CAT-2");
                dataset.addValue(h,"JAVA","CAT-2");
                
                dataset.addValue(c,"DSA","FAT");
                dataset.addValue(f,"DBMS","FAT");
                dataset.addValue(i,"JAVA","FAT");
                
		// create a chart...
		JFreeChart chart = ChartFactory.createBarChart("Mark Analysis","Subjects","Marks", (CategoryDataset) dataset,PlotOrientation.VERTICAL,true,true,false);
		ChartFrame frame = new ChartFrame("JFreeChat Pie Chart", chart);
		frame.pack();
		frame.setVisible(true);
	}
       /* public static void main(String args[]){
            markAnalyse ma = new markAnalyse();
            ma.showbar();
        }*/
}
