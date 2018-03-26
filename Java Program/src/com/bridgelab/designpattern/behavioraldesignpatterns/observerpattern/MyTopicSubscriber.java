/******************************************************************************
 *  
 *  Purpose : Determine Behavioral Design Pattern and it is TopicSubscriber Class
 *            implemnt Observer interface.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/



package com.bridgelab.designpattern.behavioraldesignpatterns.observerpattern;

public class MyTopicSubscriber implements Observer{
	private String name;
	private Subject topic;
	
	public MyTopicSubscriber(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic=sub;
	}

}
