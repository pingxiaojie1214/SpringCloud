# SpringCloud搭建学习
## Day_1
### 测试markDown      
```
public class DateDemo {
    public static void main(String[] args) {
        // 这个类的精华就在于入参,可以转换不同的格式
        // 注意这个类不是线程安全的,切记不可多个线程共享同一个实例
        // 真要在多线程环境下使用可以使用 ThreadLocal存对应线程的 Format
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //字符串转时间
        String myTimeStr  = "2019-11-01 08:19:03";
        try {
            Date myDate = format.parse(myTimeStr);
            System.out.println(myDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //时间转字符串
        Date currentDate = new Date();
        String currentDateStr = format.format(currentDate);
        System.out.println(currentDateStr);
    }
}	
```
## Day_2
### 测试markDown      
```
public class DateDemo {
    public static void main(String[] args) {
        // 这个类的精华就在于入参,可以转换不同的格式
        // 注意这个类不是线程安全的,切记不可多个线程共享同一个实例
        // 真要在多线程环境下使用可以使用 ThreadLocal存对应线程的 Format
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //字符串转时间
        String myTimeStr  = "2019-11-01 08:19:03";
        try {
            Date myDate = format.parse(myTimeStr);
            System.out.println(myDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //时间转字符串
        Date currentDate = new Date();
        String currentDateStr = format.format(currentDate);
        System.out.println(currentDateStr);
    }
}	
```
