(ns four-clojure-answers.problem-065)

(def answer
  (fn [coll]
    (let [xs (empty coll)]
      (cond
        (= xs {}) :map
        (= xs #{}) :set
        (= (conj xs :x :y) [:x :y]) :vector
        :else :list))))
