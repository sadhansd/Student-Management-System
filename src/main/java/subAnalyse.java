import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class subAnalyse 
{
    
	public void showPie(String sub,int a,int b,int c) {
                
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("CAT - 1", a);
		dataset.setValue("CAT - 2", b);
		dataset.setValue("FAT", c);
		// create a chart...
		JFreeChart chart = ChartFactory.createPieChart(sub+" Marks ", dataset, true, // legend?
				true, // tooltips?
				false // URLs?
		);
		ChartFrame frame = new ChartFrame("JFreeChat Pie Chart", chart);
		frame.pack();
		frame.setVisible(true);
	}
        /*public static void main(String args[]){
            analyse a = new analyse(20,30,40);
            a.showPie(20, 30, 40);
        }*/
}