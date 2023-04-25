(ns clojuredocs.page.home)


(defn home-page
  []
  [:div.container
   [:div.m-6
    [:div.box {:style {:height "50vh"}}
     [:div.is-flex.is-justify-content-center.py-6 {:style {:width "100%"}} [:h1.title.is-1 "clojuredocs br"]]
     [:input.input
      {:placeholder "buscar por..."}]
     [:div]]]])

