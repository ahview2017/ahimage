/*
 *	History				Who				What
 *  2017年9月4日			liujinfeng			Created.
 */
package com.deepai.photo.common.util;

import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;

import com.deepai.photo.bean.CpPicGroup;
import com.deepai.photo.bean.CpPicture;

/**
 * Title: TRS 内容协作平台（TRS WCM） <BR>
 * Description: <BR>
 * 签报生存xml文件 <BR>
 * Copyright: Copyright (c) 2004-2017 北京拓尔思信息技术股份有限公司 <BR>
 * Company: www.trs.com.cn <BR>
 * 
 * @author liu.jinfeng
 * @version 1.0
 */
public class XMLUtils {

    /**
     * 生成xml文件
     * @Description: TODO <BR>
     * @author liu.jinfeng
     * @date 2017年9月4日 下午4:55:39
     * @param group
     * @param pic
     * @param type 类型0:新华社图片；1:报社图片
     * @return
     */
    public static Document createDoc(CpPicGroup group, CpPicture pic,
            Integer type) {
        Document document = DocumentHelper.createDocument();
        document.setXMLEncoding("GB2312");
        Element root = DocumentHelper.createElement("News");

        Element eAuthor = DocumentHelper.createElement("Author");
        eAuthor.setText("测试1");

        Element eTitle = DocumentHelper.createElement("Title");
        eTitle.setText("测试2");
        Element eType = DocumentHelper.createElement("Type");
        eType.setText("3");
        Element eTime = DocumentHelper.createElement("Time");
        eTime.setText("4");
        Element eBody = DocumentHelper.createElement("Body");
        eBody.setText("5");
        Element eSender = DocumentHelper.createElement("Sender");
        eSender.setText("6");

        root.add(eAuthor);
        root.add(eTime);
        root.add(eTitle);
        root.add(eBody);
        root.add(eSender);
        root.add(eType);

        document.add(root);
        return document;
    }

    public static void writeXML(Document doc, String targetFile)
            throws IOException {
        OutputFormat of = OutputFormat.createPrettyPrint();
        of.setEncoding("GB2312");
        of.setIndent(true);
        of.setNewlines(true);
        org.dom4j.io.XMLWriter xw = new org.dom4j.io.XMLWriter(
                new FileWriter(targetFile), of);
        xw.write(doc);
        xw.flush();
    }

}
