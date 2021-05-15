var app = angular.module('map', []);

app.controller("MapController", function ($scope, $http) {

    $scope.getMap = function () {
        $http.get('/public/rest/map').success(function (data, status, headers, config) {
            $scope.mapList = data;
        }).error(function (data, status, headers, config) {
            if (data.message === 'Time is out') {
                $scope.finishByTimeout();
            }
        });
    };

    $scope.deleteMap = function (id) {
        $http.delete('/public/rest/map/' + id).success(function (data, status, headers, config) {
            for (var i = 0; i < $scope.mapList.length; i++) {
                var j = $scope.mapList(i);
                if (j.id === id) {
                    $scope.mapList.splice(i, 1);
                    break;
                }
            }
        }).error(function (data, status, headers, config) {
            console.error(status, data, headers);
        });
    };
    $scope.deleteallMap = function () {
        $http.delete('/public/rest/map').success(function (data, status, headers, config) {
            for (var i = 0; i < $scope.mapList.length; i++) {
                $scope.mapList.splice(0, 1);
            }
        }).error(function (data, status, headers, config) {
            console.error(status, data, headers);
        });
    };
    $scope.addMap = function () {
        $http.post('/public/rest/map/' + $scope.x + "/" + $scope.y).success(function (data, status, headers, config) {
            $scope.mapList.splice(0, 0, data);
        }).error(function (data, status, headers, config) {
            console.error(status, data, headers);
        });
    };
});



