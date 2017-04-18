# bishe结束总结：
1.WEB-INF下的资源（jsp,js，css,image）无法通过url直接访问。
        解决：a.我们可以将(js,css,image）新建文件夹放在web-inf外面
              b.通过action中写转向代码间接访问jsp（推荐）
              
2.input标签name属性要和数据库的字段名一致
             
