/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ReviewCommittee;

import Business.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author cheta
 */
public class FeedbackPool {
 
    private ArrayList<Feedback> feedbackPool;

    public FeedbackPool()
    {
        feedbackPool = new ArrayList();
    }

    public ArrayList<Feedback> getFeedbackPool() {
        return feedbackPool;
    }

    public void setFeedbackPool(ArrayList<Feedback> feedbackPool) {
        this.feedbackPool = feedbackPool;
    }
    
    
    
    public Feedback addP() {
        Feedback f = new Feedback();
        feedbackPool.add(f);
        return f;
    }

}
