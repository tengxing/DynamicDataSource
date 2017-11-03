package cn.yjxxclub.demo.datasource.model;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-11-2
 * Time: 上午8:31
 * Describe: Singer
 */
public class Singer {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
