package org.elasticsearch.index.analysis;

/**
 * Created by IntelliJ IDEA.
 * User: Medcl'
 * Date: 12-5-21
 * Time: 下午5:53
 */

public class TermItem implements Comparable<TermItem>{
    public static final String TYPE_PINYIN = "PINYIN";
    public static final String TYPE_CN_WORD = "CN_WORD";
    String term;
    int startOffset;
    int endOffset;
    int position;
    String type;

    public TermItem(String term,int startOffset,int endOffset,int position){
        this.term=term;
        this.startOffset=startOffset;
        this.endOffset=endOffset;
        this.position=position;
        this.type = TYPE_PINYIN;
    }

    public TermItem(String term,int startOffset,int endOffset,int position, String type){
        this(term, startOffset, endOffset, position);
        this.type = type;
    }

    @Override
    public String toString() {
        return term;
    }

    @Override
    public int compareTo(TermItem o) {
        return this.position-o.position;
    }
}
