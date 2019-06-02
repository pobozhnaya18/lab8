package application;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Extractor {
    public int getValueAtPosEndMinusOffset(List<Integer> list,int offset)throws IndexOutOfBoundsException{
        return list.get(list.size()-offset-1);
    }
}
