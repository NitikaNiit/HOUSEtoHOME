'use strict';

app
		.service(
				'UserService',
				[
						'$http',
						'$q',
						'$rootScope',
						function($http, $q, $rootScope) {

							console.log("UserService...")

							var BASE_URL = 'http://localhost:9012/loginBackend'

							return {

					            fetchAllUsers: function() {
					            	console.log("calling fetchAllUsers ")
					                    return $http.get(BASE_URL+'/listAllUsersNotFriends')
					                            .then(
					                                    function(response){
					                                        return response.data;
					                                    }, 
					                                   null
					                            );
					            },
								
								createUser : function(user) {
									console.log("calling create user")
									return $http
											.post(BASE_URL + '/user/', user)
											// 1
											.then(
													function(response) {
														return response.data;
													},
													function(errResponse) {
														console
																.error('Error while creating user');
														return $q
																.reject(errResponse);
													});
								},

								authenticate : function(user) {
									console
											.log("Calling the method authenticate with the user :"
													+ user)

									return $http
											.post(BASE_URL + '/login', user)
											.then(function(response) {
												return response.data; // user
																		// json
																		// object
											}, null);
								},

								logout : function() {
									console.log('logout....')
									return $http.get(BASE_URL + '/user/logout')
											.then(function(response) {
												return response.data;
											}, null);
								},

								updateUser : function(user, id) {
									console.log("Update the user details ")
									return $http
											.put(BASE_URL + '/user/', user)
											// 2
											.then(
													function(response) {
														return response.data;
													},
													function(errResponse) {
														console
																.error('Error while updating user');
														return $q
																.reject(errResponse);
													});
								}

								
								
							}
						} 
						
				]);