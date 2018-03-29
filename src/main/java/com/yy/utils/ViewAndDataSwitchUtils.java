package com.yy.utils;

import com.yy.pojo.Car;
import com.yy.pojo.Driver;
import com.yy.pojo.Log;
import com.yy.viewpojo.ViewCar;
import com.yy.viewpojo.ViewDriver;
import com.yy.viewpojo.ViewLog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: 595703420@qq.com
 * @Date: 2018/2/26.
 */
public class ViewAndDataSwitchUtils {
    /**
     *  视图car 转成数据层car
     * @param vcar
     * @return
     * @throws ParseException
     */
    public static Car VcarToCar(ViewCar vcar) throws ParseException {
        Car car = new Car();
        //给数据层car赋值
        car.setCarid(vcar.getCarid());
        if (vcar.getCarname() != null && vcar.getCarname() != "") {
            car.setCarname(vcar.getCarname());
        }
        if (vcar.getBoatload() != null && vcar.getBoatload() != 0) {
            car.setBoatload(vcar.getBoatload());
        }
        if (vcar.getLocation() != null && vcar.getLocation() != "") {
            car.setBoatload(vcar.getBoatload());
        }
        if (vcar.getStatus() != null && vcar.getStatus() != "") {
            if (vcar.getStatus() == "正常") {
                car.setStatus(0);
            } else if (vcar.getStatus() == "维修") {
                car.setStatus(1);
            } else if (vcar.getStatus() == "报废") {
                car.setStatus(2);
            }
        }
        if (vcar.getBuytime() != null && vcar.getBuytime() != "") {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            long time = simpleDateFormat.parse(vcar.getBuytime()).getTime();
            Date data = new Date(time);
            car.setBuytime(data);
        }
        if(vcar.getMsg()!=null &&vcar.getMsg()!=""){
            car.setMsg(vcar.getMsg());
        }
        return car;
    }

    /**
     * 数据层car 转换为视图car
     * @param car
     * @return
     */
    public static ViewCar CarToVcar(Car car){
        //转换时间对象Buytime
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(car.getBuytime());
        //转换状态对象为视图值
        String status="";
        switch (car.getStatus()){
            case 0:
                status="正常";
                break;
            case 1:
                status="维修";
                break;
            case 2:
                status="报废";
                break;
        }
        return new ViewCar(car.getCarid(),car.getCarname(),format,car.getBoatload(),car.getLocation(),status,car.getMsg());
    }

    /**
     * 视图VDriver 转换成 数据Driver
     * @param vDriver
     * @return
     */
    public static Driver VDriverToDriver(ViewDriver vDriver){
        Driver driver=new Driver();
        if(vDriver.getDrivername()!=null && vDriver.getDrivername() !=""){
            driver.setDrivername(vDriver.getDrivername());
        }
        if(vDriver.getWechat()!=null && vDriver.getWechat() !=""){
            driver.setWechat(vDriver.getWechat());
        }
        if(vDriver.getPhone()!=null && vDriver.getPhone() !=""){
            driver.setPhone(vDriver.getPhone());
        }
        if(vDriver.getExigencyphone()!=null && vDriver.getExigencyphone() !=""){
            driver.setExigencyphone(vDriver.getExigencyphone());
        }
        if(vDriver.getAddress()!=null && vDriver.getAddress() !=""){
            driver.setAddress(vDriver.getAddress());
        }
        if(vDriver.getDriverstatus()!=null && vDriver.getDriverstatus() !=""){
            if(vDriver.getDriverstatus()=="在职在位"){
                driver.setDriverstatus(0);
            }else  if(vDriver.getDriverstatus()=="事假"){
                driver.setDriverstatus(1);
            }else if(vDriver.getDriverstatus()=="离职"){
                driver.setDriverstatus(99);
            }
        }
        return driver ;
    }

    /**
     * 数据Driver 转换成 视图VDriver
     * @param driver
     * @return
     */
    public static ViewDriver DriverToVDriver(Driver driver){
        String driverstatus="";
        switch (driver.getDriverstatus()){
            case 0:
                driverstatus="在职在位";
                break;
            case 1:
                driverstatus="事假";
                break;
            case 99:
                driverstatus="离职";
                break;
            default:
                break;
        }
        return new ViewDriver(driver.getDriverid(),driver.getDrivername(),driver.getWechat(),driver.getPhone(),driver.getExigencyphone(),driver.getAddress(),driverstatus);
    }

    /**
     * 操作记录检查查询
     * @param logs
     * @return
     */
    public static List<ViewLog> LogsToViews(List<Log> logs){
        List<ViewLog> viewLogs=new ArrayList<>();
        for(Log log : logs){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(log.getCreationtime());
            ViewLog viewLog = new ViewLog(format,log.getLogcontent());
            viewLogs.add(viewLog);
        }
        return viewLogs;
    }
}
