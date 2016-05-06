(ns graphsx.core)

(defn foo []
  "I don't do a whole lot.")

(defn read-csv [file]
  (with-open [in-file (io/reader file)]
    (doall
      (csv/read-csv in-file))))

(def edge-data (rest (read-csv "resources/data/stormofswords.csv")))

(def graph
  (reduce
    (fn [g [source target weight]] (add-edge g source target))
    (empty-graph)
    edge-data))
