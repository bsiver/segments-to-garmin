(ns segments-to-garmin.core
	(:require
		[clj-http.client :as http]
		[cheshire.core :as cheshire]))

(def strava-api-base-url "https://www.strava.com/api/v3/segments/starred")

(defn retrieve-segments
	[token]
	(http/get strava-api-base-url {:oauth-token token}))

(defn -main
	[token]
	(prn (retrieve-segments token)))
