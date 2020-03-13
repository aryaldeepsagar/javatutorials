/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandesh
 */
public class Score {
    private String module;
    private int correct;
    private int wrong;
    private double final_percentage;

    /**
     * @return the module
     */
    public String getModule() {
        return module;
    }

    /**
     * @param module the module to set
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * @return the correct
     */
    public int getCorrect() {
        return correct;
    }

    /**
     * @param correct the correct to set
     */
    public void setCorrect(int correct) {
        this.correct = correct;
    }

    /**
     * @return the wrong
     */
    public int getWrong() {
        return wrong;
    }

    /**
     * @param wrong the wrong to set
     */
    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    /**
     * @return the final_percentage
     */
    public double getFinal_percentage() {
        return final_percentage;
    }

    /**
     * @param final_percentage the final_percentage to set
     */
    public void setFinal_percentage(double final_percentage) {
        this.final_percentage = final_percentage;
    }
}
