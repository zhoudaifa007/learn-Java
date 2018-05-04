package com.zhou.daqin.jueqi.alibaba.collection;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;


/**
 * Created by zhoudf2 on 2017-7-8.
 */

public class CollectionTest {

    @Test
    public void test1() {
        System.out.println("fdsafdsafdsaf");
    }

    @Test
    public void test2() {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>(5);
        arrayBlockingQueue.add(1);
        arrayBlockingQueue.add(2);
        arrayBlockingQueue.add(3);
        arrayBlockingQueue.add(4);
        arrayBlockingQueue.add(5);
        arrayBlockingQueue.poll();
        System.out.println("add 5");
        try {
            arrayBlockingQueue.put(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("add 6");
    }

    @Test
    public void test3() {
        String path = "/f1/f2";
        String[] array = path.split("/");
        System.out.println(array);
    }


    @Test
    public void test4() {
        String str = "{\"result\":{\"subinfos\":[{\"filetype\":\"1\",\"uid\":\"g_566\",\"bucketName\":\"app_a9d2c0a01c46443f_g_566_bucket\",\"filename\":\"170411_0冷水演示板展柜效果.jpg\",\"filesize\":\"1755600\",\"key\":\"\",\"fileid\":\"4273492470462\",\"md5\":\"1a6f8c80604784e1342d03003be7c34c\"},{\"filetype\":\"1\",\"uid\":\"g_566\",\"bucketName\":\"app_a9d2c0a01c46443f_g_566_bucket\",\"filename\":\"170411_0冷水体验区.jpg\",\"filesize\":\"2126769\",\"key\":\"\",\"fileid\":\"738734385853\",\"md5\":\"18a8460697530e8658677730e1d4c5a1\"},{\"filetype\":\"1\",\"uid\":\"g_566\",\"bucketName\":\"app_a9d2c0a01c46443f_g_566_bucket\",\"filename\":\"微信图片_20170515101711.jpg\",\"filesize\":\"1710018\",\"key\":\"\",\"fileid\":\"2203586669147\",\"md5\":\"401f3c1ecf9407cd28315191edb86770\"},{\"filetype\":\"1\",\"uid\":\"g_566\",\"bucketName\":\"app_a9d2c0a01c46443f_g_566_bucket\",\"filename\":\"比佛利0冷水演示板.jpg\",\"filesize\":\"750144\",\"key\":\"\",\"fileid\":\"4325032078015\",\"md5\":\"e195966108367b1413e1d7e0fd3caf8b\"},{\"filetype\":\"1\",\"uid\":\"g_566\",\"bucketName\":\"app_a9d2c0a01c46443f_g_566_bucket\",\"filename\":\"微信图片_20170515101717.jpg\",\"filesize\":\"1953593\",\"key\":\"\",\"fileid\":\"3251290254016\",\"md5\":\"1867be7026dd4b12aa756ed003abc9d0\"},{\"filetype\":\"2\",\"uid\":\"g_566\",\"bucketName\":\"app_a9d2c0a01c46443f_g_566_bucket\",\"filename\":\"施工图\",\"subinfos\":[{\"filetype\":\"1\",\"bucketName\":\"app_a9d2c0a01c46443f_g_566_bucket\",\"filesize\":4034858,\"parentid\":\"2078764182204\",\"uid\":\"g_566\",\"deletetag\":0,\"upUid\":\"\",\"filename\":\"170531美的零冷水1.2米演示版  发光字  视频盒.jpg\",\"modifyTime\":\"2017-08-03 13:52:44\",\"createTime\":\"2017-08-03 13:52:44\",\"seqid\":23062,\"fileid\":\"3212903983709\",\"md5\":\"ec57c63a9c2a0d0fa1003eb7316c033e\"},{\"filetype\":\"1\",\"bucketName\":\"app_a9d2c0a01c46443f_g_566_bucket\",\"filesize\":3345347,\"parentid\":\"2078764182204\",\"uid\":\"g_566\",\"deletetag\":0,\"upUid\":\"\",\"filename\":\"170531美的零冷水1.2米演示版.jpg\",\"modifyTime\":\"2017-08-03 13:52:45\",\"createTime\":\"2017-08-03 13:52:45\",\"seqid\":23063,\"fileid\":\"1366068046430\",\"md5\":\"59fac2ef1a965990c1b5931add566026\"},{\"filetype\":\"1\",\"bucketName\":\"app_a9d2c0a01c46443f_g_566_bucket\",\"filesize\":3734985,\"parentid\":\"2078764182204\",\"uid\":\"g_566\",\"deletetag\":0,\"upUid\":\"\",\"filename\":\"170531美的零冷水1.2米展示墙   安装说明.jpg\",\"modifyTime\":\"2017-08-03 13:52:46\",\"createTime\":\"2017-08-03 13:52:46\",\"seqid\":23064,\"fileid\":\"2126008822468\",\"md5\":\"112683942ade12bfdf7658242f23e414\"},{\"filetype\":\"1\",\"bucketName\":\"app_a9d2c0a01c46443f_g_566_bucket\",\"filesize\":1938902,\"parentid\":\"2078764182204\",\"uid\":\"g_566\",\"deletetag\":0,\"upUid\":\"\",\"filename\":\"170601美的零冷水1.2米展示墙  电源底座.jpg\",\"modifyTime\":\"2017-08-03 13:52:48\",\"createTime\":\"2017-08-03 13:52:48\",\"seqid\":23065,\"fileid\":\"4016062868064\",\"md5\":\"5b15e78ae8d02d94763dccd34e48c8d0\"}],\"filesize\":\"0\",\"key\":\"\",\"fileid\":\"2078764182204\",\"md5\":\"\"}]},\"errorCode\":\"200\"}";

        JSONObject jsonObject = JSON.parseObject(str);
        List<JSONObject> list = new ArrayList<JSONObject>();
        JSONObject jsonObject1 = jsonObject.getJSONObject("result");
        depth(jsonObject1,list);
        System.out.println(JSONObject.toJSONString(list));

    }

    private void depth(JSONObject json, List<JSONObject> list){
       JSONArray jsonArray =  json.getJSONArray("subinfos");
       if(!CollectionUtils.isEmpty(jsonArray)) {
           int size = jsonArray.size();
           for(int i = 0; i < size; i++) {
               JSONObject jsonObject1 = (JSONObject)jsonArray.get(i);
               String fileType = jsonObject1.getString("filetype");
               String fileName = jsonObject1.getString("filename");
               String pfileName = json.getString("filename");
               String fullName = null;
               if(StringUtils.isEmpty(pfileName)) {
                   fullName  =  "/" + fileName;
               } else {
                   fullName = pfileName + "/" + fileName;
               }
               jsonObject1.put("filename",fullName);
               if("2".equals(fileType)) {
                   depth(jsonObject1,list);
               } else{
                   list.add(jsonObject1);
               }
           }
       }
    }
}
