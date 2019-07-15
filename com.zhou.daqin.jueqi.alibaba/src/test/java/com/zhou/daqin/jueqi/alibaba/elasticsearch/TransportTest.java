package com.zhou.daqin.jueqi.alibaba.elasticsearch;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Daifa on 2018/4/29.
 */
public class TransportTest {

     @Test
     public void test1(){
          try {
               Settings settings = Settings.builder().put("cluster.name", "distribution_run").build();
               TransportClient client = new PreBuiltTransportClient(settings)
                       .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
               GetResponse response = client.prepareGet("website", "blog", "AWMHVaesXwpGuvHHNcVg").execute().actionGet();
               //输出结果
               System.out.println(response.getSourceAsString());
               //关闭client
               client.close();
          } catch (UnknownHostException e) {

          }
          //QueryBuilder qb1 = QueryBuilders.matchAllQuery();
     }
}
