(defproject graphsx "0.1.0-SNAPSHOT"
  :description "playspace for graphs"
  :url "http://notsureyet.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [org.clojure/core.memoize "0.5.6"]
                 [org.clojure/data.json "0.2.1"]
                 [org.clojure/data.xml "0.0.7"]
                 [org.clojure/data.csv "0.1.2"]
                 [org.clojure/data.zip "0.1.1"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [org.clojure/tools.reader "0.7.10"]]
  :profiles {:dev {:main graphsx.core
                   :dependencies [[org.clojure/tools.namespace "0.2.8"]
                                  [speclj "3.1.0"]]
                   :source-paths ["dev"]}
             :test {:main graphsx.core
                    :dependencies [[org.clojars.trptcolin/blackwater "0.0.9.2"]]}
             }

  :aliases {"spec"
            ["with-profile" "+test" "spec"]
            "test"
            ["with-profile" "+test" "spec" "--tag" "~integration"]
            "test-it"
            ["with-profile" "+test" "spec" "--tag" "integration"]}
  :plugins [[speclj "3.1.0"]
            [ragtime/ragtime.lein "0.3.6"]]
  :source-paths ["src"]
  :test-paths ["spec"])
