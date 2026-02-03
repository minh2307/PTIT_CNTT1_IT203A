package ss08.HN_KS24_CNTT1_NguyenSonMinh;

public class Student {
    private String id;
    private  String name;
    private double score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getRank(){
        if (this.score >= 8.0) {
            return "gioi";
        }else if (this.score >= 6.5 && this.score < 8.0 ){
            return "kha";
        }else {
            return "trung binh";
        }
    }


    public String toString(){
        return "\nid: " + this.score + "\nTên: " + this.name + "\nĐiểm: " + this.score + "\nHọc lực: " + getRank();
    }

}
