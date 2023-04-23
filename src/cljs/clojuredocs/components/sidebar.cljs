(ns clojuredocs.components.sidebar)


(defn sidebar
  []
  [:aside.menu.box.column.is-3
   [:div
    [:h5.menu-label "Namespaces"]
    [:hr]
    [:ul.menu-list
     [:li
      [:strong.menu-label "clojure"]
      [:ul.menu-list
       [:li
        [:span [:a {:href "/clojure.core"} "core"]]
        [:ul.menu-list
         [:li [:span [:a {:href "/clojure.core.async"} "async"]]]
         [:li
          [:span [:a {:href "/clojure.core.logic"} "logic"]]
          [:ul.menu-list
           [:li [:span [:a {:href "/clojure.core.logic.fd"} "fd"]]]
           [:li [:span [:a {:href "/clojure.core.logic.pldb"} "pldb"]]]]]
         [:li [:span [:a {:href "/clojure.core.protocols"} "protocols"]]]
         [:li [:span [:a {:href "/clojure.core.reducers"} "reducers"]]]
         [:li [:span [:a {:href "/clojure.core.server"} "server"]]]]]
       [:li [:span [:a {:href "/clojure.data"} "data"]]]
       [:li [:span [:a {:href "/clojure.datafy"} "datafy"]]]
       [:li [:span [:a {:href "/clojure.edn"} "edn"]]]
       [:li [:span [:a {:href "/clojure.inspector"} "inspector"]]]
       [:li [:span [:a {:href "/clojure.instant"} "instant"]]]
       [:li
        [:strong.menu-label "java"]
        [:ul.menu-list
         [:li [:span [:a {:href "/clojure.java.browse"} "browse"]]]
         [:li [:span [:a {:href "/clojure.java.io"} "io"]]]
         [:li [:span [:a {:href "/clojure.java.javadoc"} "javadoc"]]]
         [:li [:span [:a {:href "/clojure.java.shell"} "shell"]]]]]
       [:li [:span [:a {:href "/clojure.main"} "main"]]]
       [:li [:span [:a {:href "/clojure.pprint"} "pprint"]]]
       [:li [:span [:a {:href "/clojure.reflect"} "reflect"]]]
       [:li [:span [:a {:href "/clojure.repl"} "repl"]]]
       [:li [:span [:a {:href "/clojure.set"} "set"]]]
       [:li
        [:strong.menu-label "spec"]
        [:ul.menu-list [:li [:span [:a {:href "/clojure.spec.alpha"} "alpha"]]]]]
       [:li [:span [:a {:href "/clojure.stacktrace"} "stacktrace"]]]
       [:li [:span [:a {:href "/clojure.string"} "string"]]]
       [:li [:span [:a {:href "/clojure.template"} "template"]]]
       [:li
        [:span [:a {:href "/clojure.test"} "test"]]
        [:ul.menu-list
         [:li [:span [:a {:href "/clojure.test.junit"} "junit"]]]
         [:li [:span [:a {:href "/clojure.test.tap"} "tap"]]]]]
       [:li [:span [:a {:href "/clojure.walk"} "walk"]]]
       [:li [:span [:a {:href "/clojure.xml"} "xml"]]]
       [:li [:span [:a {:href "/clojure.zip"} "zip"]]]]]]]])

