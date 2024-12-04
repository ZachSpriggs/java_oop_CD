import java.util.*;
public class ProjectTest {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();

        // Create first project that's empty and call the methods to add fields
        Project firstProject = new Project();
        
        firstProject.setName("LegalEZ");
        firstProject.setDescription("Probably not our best work");
        firstProject.setInitialCost(5.00);

        // Create 3 new projects with different inputs
        Project secondProject = new Project("DevTank");
        Project thirdProject = new Project("FridgeBuddy", "Organize everything in your fridge conveniently!");
        Project fourthProject = new Project("Chick Magnet", "It's like flappy bird but wayyyyyyy better!", 19.99);

        // Add each project to the portfolio class
        portfolio.addProject(firstProject);
        portfolio.addProject(secondProject);
        portfolio.addProject(thirdProject);
        portfolio.addProject(fourthProject);

        // Call on the showPortfolio method from within the portfolio class
        portfolio.showPortfolio();

    }
}