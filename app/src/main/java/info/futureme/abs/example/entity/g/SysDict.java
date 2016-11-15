package info.futureme.abs.example.entity.g;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "sysdict".
 */
public class SysDict {

    private Long id;
    private Integer dictId;
    private Integer dictType;
    private String dictCode;
    private String dictName;
    private Integer isDelete;
    private Integer rank;

    public SysDict() {
    }

    public SysDict(Long id) {
        this.id = id;
    }

    public SysDict(Long id, Integer dictId, Integer dictType, String dictCode, String dictName, Integer isDelete, Integer rank) {
        this.id = id;
        this.dictId = dictId;
        this.dictType = dictType;
        this.dictCode = dictCode;
        this.dictName = dictName;
        this.isDelete = isDelete;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public Integer getDictType() {
        return dictType;
    }

    public void setDictType(Integer dictType) {
        this.dictType = dictType;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

}
