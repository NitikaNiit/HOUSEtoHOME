var app = angular.module('myApp',['ngRoute','ngCookies']);

app.config(function($routeProvider)
{
	$routeProvider
	.when("/register",{
		templateUrl:'app/components/c_user/register.html',
		controller:'UserController'
	})
	.when("/profile",{
		templateUrl:'app/components/c_user/profile.html',
		controller:'UserController'
	})
	.when("/login",{
		templateUrl:'app/components/c_user/login.html',
		controller:'UserController'
	})
	.when("/job",{
		templateUrl:'app/components/c_job/post_job.html',
		controller:'JobController'
	})
	.when("/searchJob",{
		templateUrl:'app/components/c_job/search_job.html',
		controller:'JobController'
	})
	.when("/view_job_details",{
		templateUrl:'app/components/c_job/view_job_details.html',
		controller:'JobController'
	})
	.when("/view_applied_jobs",{
		templateUrl:'app/components/c_job/view_applied_jobs.html',
		controller:'JobController'
	})
	.when("/search_friend", {
		templateUrl : 'app/components/c_friend/search_friend.html',
		controller : 'FriendController'
	})
	.when("/view_friend", {
		templateUrl : 'app/components/c_friend/view_friend.html',
		controller : 'FriendController'
	})
	.when("/editProfile",{
		templateUrl:'app/components/c_user/editProfile.html',
		controller:'UserController'
	})
});

	app.run( function ($rootScope, $location,$cookieStore, $http) {
		 
		 // keep user logged in after page refresh
	     $rootScope.currentUser = $cookieStore.get('currentUser') || {};
	     if ($rootScope.currentUser) {
	         $http.defaults.headers.common['Authorization'] = 'Basic' + $rootScope.currentUser; 
	     }

	});


			
