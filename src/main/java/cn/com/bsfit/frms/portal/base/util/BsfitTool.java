package cn.com.bsfit.frms.portal.base.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class BsfitTool {

	public static String trim(Object obj){
    	if(obj==null){
    		return "";
    	}
    	if(obj instanceof String){
    		return StringUtils.trimToEmpty(String.valueOf(obj));
    	}else{
    		return String.valueOf(obj);
    	}
    }
	
	public static int YUAN2LI = 1000;
	public static int YUAN2FEN = 100;
	public static int FEN2LI = 10;
	
	
	public static long amountFormat(Object obj, int rate){
		long amount = 0;
		if(obj==null){
			return amount;
		}
		if(obj instanceof BigDecimal){
			BigDecimal bd = (BigDecimal)obj;
			amount = new BigDecimal(bd.doubleValue()*rate).longValue();
		}
		return amount;
	}

    /**
     * 将一个大的列表拆分为多个子列表。
     * 
     * @param list
     *            待拆分列表
     * @param partition
     *            拆分数目
     * @return 子列表集合。
     */
    public static <T> List<List<T>> partition(List<T> list, int partition) {
        List<List<T>> lists = new ArrayList<List<T>>();
        if (list == null || list.size() < 2 || partition < 2) {
            lists.add(list);
        } else {
            int oSize = list.size();
            int batch = oSize / partition;
            // 最小批处理量为1.
            batch = batch <= 0 ? 1 : batch;
            int index = 0;
            int endIndex = 0;
            for (int i = 0; i < partition - 1 && index < oSize; ++i) {
                endIndex = Math.min(list.size(), index + batch);
                lists.add(list.subList(index, endIndex));
                index += endIndex - index;
            }
            if (index < oSize) {
                lists.add(list.subList(index, oSize));
            }
        }
        return lists;
    }
    

    public static <T> List<List<T>> splitList(List<T> list, int commitSize) {
        List<List<T>> splistList = new ArrayList<List<T>>();
        if (list == null || list.isEmpty()) {
            return splistList;
        }
        int range = commitSize;
        if (list.size() < range) {
            splistList.add(list);
            return splistList;
        }
        int size = list.size();
        int num = size % range == 0 ? size / range : (size / range) + 1;
        for (int j = 0; j < num; j++) {
            int beg = range * j;
            int end = range * j + range;
            if ((j + 1) == num) {
                end = size;
            }
            splistList.add(list.subList(beg, end));
        }
        return splistList;
    }
}
