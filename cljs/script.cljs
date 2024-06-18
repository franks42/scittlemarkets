(ns script)

(defn my-alert42 []
  (js/alert "You clicked 42!"))

(set! (.-my_alert42 js/window) my-alert42)
