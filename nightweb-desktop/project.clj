(defproject nightweb "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [splendid/jfx "0.5.0"]
                 [com.oracle/javafx-runtime "2.2"]
                 [com.h2database/h2 "1.3.168"]
                 [org.clojure/java.jdbc "0.2.3"]]
  :main nightweb.core
  :java-source-paths ["../nightweb-core/java"])
