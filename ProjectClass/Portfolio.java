import java.util.*;

public class Portfolio extends Project {
    private ArrayList<Project> projects = new ArrayList<>();
    private String name;
    private String description;
    private double initialCost;

    public void addProject(Project project){
        this.projects.add(project);
    }
    
    public double getTotalCost(){
        double cost = 0;
        for(Project project: this.projects){
            cost += project.getInitialCost();
        }
        return cost;
    }

    public void showPortfolio(){
        System.out.println("All projects in your portfolio: ");
        for(Project project: this.projects){
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total cost of the portfolio is $" + getTotalCost());
    }
    
}

