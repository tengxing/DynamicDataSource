package cn.yjxxclub.demo.datasource.model;

/**
 * Author: 遇见小星
 * Email: tengxing7452@163.com
 * Date: 17-5-11
 * Time: 下午7:49
 * Describe: book
 */
public class Book implements java.io.Serializable{

    private Integer id;//id
    private String bookname;//书名
    private String author;//作者
    private String publish;//出版社
    private double price;//价格
    private String time; //出版时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", price=" + price +
                ", time='" + time + '\'' +
                '}';
    }
}
