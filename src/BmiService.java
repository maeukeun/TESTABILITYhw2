public class BmiService {
    public float calculate(int weight, float height){
        float result;
        result = weight / (height * height);

        return result;
    }
}
