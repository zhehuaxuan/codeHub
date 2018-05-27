var insert_sort = function (arrs){
	for(var j=1;j<arrs.length;j++){
		var key = arrs[j];
		var i = j-1;
		while(i>=0&&arrs[i]>key){
			arrs[i+1] = arrs[i];
			i--;
		}
		arrs[i+1] = key;
	}
}
var select_sort = function(arrs) {
        if (arrs == null || arrs.length <= 0) {
            return;
        }
        for (var i = 0; i < arrs.length; i++) {
            var temp = arrs[i];
            var flag = i; // 将当前下标定义为最小值下标
            for (var j = i + 1; j < arrs.length; j++) {
                if (a[j] < temp) {// a[j] < temp 从小到大排序；a[j] > temp 从大到小排序
                    temp = a[j];
                    flag = j; // 如果有小于当前最小值的关键字将此关键字的下标赋值给flag
                }
            }
            if (flag != i) {
                a[flag] = a[i];
                a[i] = temp;
            }
        }
    }
var bubble_sort = function(a){
        for(var i=0;i<a.length-1;i++){
            for(var j=0;j<a.length-1-i;j++){
                if(a[j+1]<a[j]){
                    var temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
}
