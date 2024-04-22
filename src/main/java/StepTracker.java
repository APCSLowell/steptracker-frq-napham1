import java.util.ArrayList;
public class StepTracker
{
 private int minsteps, totalsteps, activedays, totaldays;
 public StepTracker(int num){
  minsteps = num;
  totalsteps = 0;
  activedays = 0;
  totaldays = 0;
 }
 public int activeDays(){
  return activedays;
 }
 public void addDailySteps(int temp){
  totalsteps += temp;
  totaldays++;
  if(temp >= minsteps){
   activedays++;
  }
 }
 public double averageSteps(){
  if(totaldays == 0){
   return 0.0;
  }
  else{
   return (double) totalsteps/totaldays;
  }
 }
} 
