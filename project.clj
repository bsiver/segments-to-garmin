(defproject segments-to-garmin "1.0.0"
  :description "A project to grab a user's starred Strava segments and upload them to a Garmin device"
  :url "https://github.com/bsiver/segments-to-garmin"
  :repl-options {:timeout 120000}
  :main segments-to-garmin.core
  :dependencies [[clj-http "2.1.0"]
                 [cheshire "5.4.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.clojure/clojure "1.8.0"]]
  :jvm-opts  ["-Xmx6g"])