/*
 * Copyright (c) 2024 Danilo Quattrini
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package it.unicam.cs.mgc.TheClothesProjectConfigurator.controller;

import it.unicam.cs.mgc.TheClothesProjectConfigurator.model.ParsedData;
import it.unicam.cs.mgc.TheClothesProjectConfigurator.model.ControllerOfOntology;
import it.unicam.cs.mgc.TheClothesProjectConfigurator.model.SPARQLqueries.SelectDataQueries;

/**
 * This class is used to manage the application state.
 */

public class Controller {

    private final ControllerOfOntology ontology = new ControllerOfOntology();

    /**
     * Returns the list of clothes in the ontology.
     *
     * @return data containing the list of clothes
     */
    public ParsedData getClothesList() {
        return ontology.get(SelectDataQueries.CLOTHES_LIST);
    }

    /**
     * Returns the ontology consistency status
     *
     * @return the ontology consistency status as a string
     */
    public String getOntologyConsistencyStatus() {
        if (ontology.isConsistent()) {
            return "Ontology consistent ✓";
        } else {
            return "Inconsistent ontology ｘ";
        }
    }
}