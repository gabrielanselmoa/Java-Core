package course.composition.q2.model.entities;

public class Comment {

    private String text;

    public Comment(){

    }

    public Comment(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
}
