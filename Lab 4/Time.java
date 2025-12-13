public class Time{
static double secondsToMinutes(int seconds){
return seconds/60.0;
}
// seconds to minutes to hours
static double secondsToHours(int seconds){
return seconds/3600.0;
}
// seconds to days
static double secondsToDays(int seconds){
return seconds/(3600.0*24.0);
}
// seconds to years
static double secondsToYears(int seconds){
return seconds/(3600.0*24.0*365);
}
// minutes to seconds
static double minutesToSeconds(double minutes){
return minutes*60;
}
// hours to seconds
static double hoursToSeconds(double hours){
return hours*60*60;
}
// days to seconds
static double daysToSeconds(double days){
return days*60*60*24;
}
// years to seconds
static double yearsToSeconds(double years){
return years*60*60*24*365;
}
}