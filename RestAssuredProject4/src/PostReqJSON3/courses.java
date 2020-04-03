package PostReqJSON3;

import java.util.ArrayList;
import java.util.List;

public class courses {

	public String name;
	public String score;
	public List<String> topics;
	
public courses(String name,String score){
		
		this.name=name;
		this.score=score;
		topics = new ArrayList<String>();
	}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getScore() {
	return score;
}

public void setScore(String score) {
	this.score = score;
}


public List<String> getTopics() {
	return topics;
}


public void setTopics(List<String> topics) {
	this.topics = topics;
}

public void addtopics(String topic) {
	topics.add(topic);
}





}
