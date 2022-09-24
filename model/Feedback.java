package com.onlinecakeshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class Feedback is the Entity representing feedback table in database
 *
 * @author Rahul 
 */

@Entity
@Table(name = "feedback_details")
public class Feedback {

	@Id
	@Column(name = "feedback_id")
	private int feedbackId;
	@Column(name = "description")
	private String description;

	/**
	 * feedback default constructor
	 */
	
	public Feedback() {
		super();
	}

	/**
     * feedback constructor with fields as parameters
     *
     * @param feedbackId   the feedback Id
     * @param description  the description given for feedback
     * @param feedbackDate the date on which feedback was given
     */
	
	public Feedback(int feedbackId, String description) {
		super();
		this.feedbackId = feedbackId;
		this.description = description;
	}

	/**
     * gets for the feedBack Id
     *
     * @param feedbackId
     */
	
	public int getFeedbackId() {
		return feedbackId;
	}
	
	/**
     * setters for the feedBack Id
     *
     * @param feedbackId
     */
	
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	/**
     * gets the feedback description
     *
     * @return
     */
	
	public String getDescription() {
		return description;
	}
	
	/**
     * setters for the feedback description
     *
     * @param description
     */
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "FeedBack [feedbackId=" + feedbackId + ", description=" + description + "]";
	}

}

