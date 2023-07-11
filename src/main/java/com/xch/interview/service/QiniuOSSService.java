package com.xch.interview.service;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @ClassName: QiniuOSSService
 * @author: xiongconghui
 * @date: 2023-05-08 19:35
 **/
@Service
public class QiniuOSSService {

//    @Value("${qiniu.accessKey}")
//    private String accessKey;
//
//    @Value("${qiniu.secretKey}")
//    private String secretKey;
//
//    @Value("${qiniu.bucket}")
//    private String bucket;
//
//    @Value("${qiniu.pathPrefix}")
//    private String pathPrefix;
//
//    public String upload(MultipartFile file,String fileName){
//
//        //构造一个带指定 Region 对象的配置类
//        Configuration cfg = new Configuration(Region.region1());  //根据自己的对象空间的地址选（华东）
//        //...其他参数参考类注释
//        UploadManager uploadManager = new UploadManager(cfg);
//
//
//        //默认不指定key的情况下，以文件内容的hash值作为文件名
//        try {
//            byte[] uploadBytes = file.getBytes();
//            Auth auth = Auth.create(accessKey, secretKey);
//            String upToken = auth.uploadToken(bucket,fileName);//文件覆盖上传
//            Response response = uploadManager.put(uploadBytes, fileName , upToken);
//
//            //解析上传成功的结果
//            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
//            System.out.println(putRet.toString());
//            return pathPrefix;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }
//
//
//    public String delete(String fileName){
//        Auth auth = Auth.create(accessKey, secretKey);
//        Configuration cfg = new Configuration(Region.region1());
//        BucketManager bucketManager = new BucketManager(auth, cfg);
//        try {
//            Response delete = bucketManager.delete(bucket, fileName);
//            return "删除成功";
//        } catch (QiniuException e) {
//            e.printStackTrace();
//        }
//
//        return  null;
//    }

}
