var app = angular.module('path', []);

app.controller("PathController", function ($scope,$http){
    
    $scope.getPath =function(){
        $http.get('/public/rest/path').success(function(data, status,headers,config){
            $scope.pathList = data;
        }).error(function(data, status,headers,config){
            if(data.message==='Time is out'){
                $scope.finishByTimeout();
            }
        });
    };
    
    $scope.deletePath = function (id) {
        $http.delete('/public/rest/path/' + id).success(function (data, status, headers, config) {
            for (var i = 0; i < $scope.pathList.length; i++) {
                var j = $scope.pathList(i);
                if (j.id === id) {
                    $scope.pathList.splice(i, 1);
                    break;
                }
            }
        }).error(function (data, status, headers, config) {
            console.error(status, data, headers);
        });
    };
    
    $scope.addPath=function(){
        $http.post('/public/rest/path/'+$scope.x1+"/"+$scope.y1+"/"+$scope.x2+"/"+$scope.y2).success(function(data, status,headers,config){
            $scope.pathList.splice(0,0,data);
        }).error(function(data, status,headers,config){
            console.error(status,data,headers);
        });
    };
});

