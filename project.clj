(def common-deps '[[cheshire "5.0.1"]
                   [clj-webdriver "0.6.0-alpha11"]
                   [gui-diff "0.3.8"]
                   [org.clojure/java.jdbc "0.2.3"]
                   [org.clojure/tools.logging "0.2.4"]])

(defproject com.runa/kits "1.3.2"
  :description "Runa base libraries"
  :plugins [[jonase/eastwood "0.0.2"]
            [lein-kibit "0.0.7"]
            [lein-swank "1.4.4"]
            [s3-wagon-private "1.1.2"]]
  :repositories {"releases" {:url "s3p://runa-maven/releases/"}
                 "snapshots" {:url "s3p://runa-maven/snapshots/"}}
  :dependencies ~(cons '[org.clojure/clojure "1.4.0"]
                       common-deps)
  :warn-on-reflection true
  :dev-dependencies [[org.clojars.runa/conjure "2.0.0"]
                     [lein-multi "1.1.0"]
                     [slamhound "1.3.1"]]
  :multi-deps {"1.2.1" [[org.clojure/clojure "1.2.1"]]
               "1.3.0" [[org.clojure/clojure "1.3.0"]]
               "1.4.0" [[org.clojure/clojure "1.4.0"]]
               "1.5.0" [[org.clojure/clojure "1.5.0-RC1"]]
               :all ~common-deps})
