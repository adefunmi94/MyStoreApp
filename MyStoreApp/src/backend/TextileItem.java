/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author FOyeyipo
 */
public class TextileItem extends Item{
    private TextileType texttileType;
    private String colorDescription;
    private String brand;
    private TextileSize textileSize;

    public TextileItem(TextileType texttileType, String colorDescription, String brand, TextileSize textileSize, String description, Double estimationValue, Condition condition, RecordType recordType) {
        super(description, estimationValue, condition, recordType);
        this.texttileType = texttileType;
        this.colorDescription = colorDescription;
        this.brand = brand;
        this.textileSize = textileSize;
    }
    
    
    
    

    @Override
    public String itemMainDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String recordKind() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "TexttileItem{" + "texttileType=" + texttileType + ", colorDescription=" + colorDescription + ", brand=" + brand + ", textileSize=" + textileSize + '}';
    }
    
    
}
