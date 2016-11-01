/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class CmakeLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"#\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"4\",\"NAME\":\"indentSize\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\",\"NAME\":\"firstlineGlob\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"none\",\"NAME\":\"wrap\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"false\",\"NAME\":\"noTabs\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"8\",\"NAME\":\"tabSize\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"0\",\"NAME\":\"maxLineLen\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"_\",\"NAME\":\"noWordSep\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"none\",\"NAME\":\"folding\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"true\",\"NAME\":\"customSettings\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"false\",\"NAME\":\"deepIndent\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"1000\",\"NAME\":\"collapseFolds\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"EOL_SPAN\",\"text\":\"#\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"${\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"MARK_FOLLOWING\",\"text\":\"$\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"LITERAL\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"OPERATOR\",\"text\":\"AND\"},{\"tag\":\"OPERATOR\",\"text\":\"BOOL\"},{\"tag\":\"OPERATOR\",\"text\":\"CACHE\"},{\"tag\":\"OPERATOR\",\"text\":\"COMMAND\"},{\"tag\":\"OPERATOR\",\"text\":\"DEFINED\"},{\"tag\":\"OPERATOR\",\"text\":\"DOC\"},{\"tag\":\"OPERATOR\",\"text\":\"EQUAL\"},{\"tag\":\"OPERATOR\",\"text\":\"EXISTS\"},{\"tag\":\"OPERATOR\",\"text\":\"FALSE\"},{\"tag\":\"OPERATOR\",\"text\":\"GREATER\"},{\"tag\":\"OPERATOR\",\"text\":\"INTERNAL\"},{\"tag\":\"OPERATOR\",\"text\":\"LESS\"},{\"tag\":\"OPERATOR\",\"text\":\"MATCHES\"},{\"tag\":\"OPERATOR\",\"text\":\"NAME\"},{\"tag\":\"OPERATOR\",\"text\":\"NAMES\"},{\"tag\":\"OPERATOR\",\"text\":\"NAME_WE\"},{\"tag\":\"OPERATOR\",\"text\":\"NOT\"},{\"tag\":\"OPERATOR\",\"text\":\"OFF\"},{\"tag\":\"OPERATOR\",\"text\":\"ON\"},{\"tag\":\"OPERATOR\",\"text\":\"OR\"},{\"tag\":\"OPERATOR\",\"text\":\"PATH\"},{\"tag\":\"OPERATOR\",\"text\":\"PATHS\"},{\"tag\":\"OPERATOR\",\"text\":\"PROGRAM\"},{\"tag\":\"OPERATOR\",\"text\":\"STREQUAL\"},{\"tag\":\"OPERATOR\",\"text\":\"STRGREATER\"},{\"tag\":\"OPERATOR\",\"text\":\"STRING\"},{\"tag\":\"OPERATOR\",\"text\":\"STRLESS\"},{\"tag\":\"OPERATOR\",\"text\":\"TRUE\"},{\"tag\":\"KEYWORD4\",\"text\":\"FOREACH\"},{\"tag\":\"KEYWORD4\",\"text\":\"ELSE\"},{\"tag\":\"KEYWORD4\",\"text\":\"ELSEIF\"},{\"tag\":\"KEYWORD4\",\"text\":\"IF\"},{\"tag\":\"KEYWORD4\",\"text\":\"MACRO\"},{\"tag\":\"KEYWORD4\",\"text\":\"ENDIF\"},{\"tag\":\"KEYWORD4\",\"text\":\"ENDWHILE\"},{\"tag\":\"KEYWORD4\",\"text\":\"ENDFOREACH\"},{\"tag\":\"KEYWORD4\",\"text\":\"ENDMACRO\"},{\"tag\":\"KEYWORD4\",\"text\":\"WHILE\"},{\"tag\":\"KEYWORD2\",\"text\":\"ADD_CUSTOM_COMMAND\"},{\"tag\":\"KEYWORD2\",\"text\":\"ADD_CUSTOM_TARGET\"},{\"tag\":\"KEYWORD2\",\"text\":\"ADD_DEFINITIONS\"},{\"tag\":\"KEYWORD2\",\"text\":\"ADD_DEPENDENCIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"ADD_EXECUTABLE\"},{\"tag\":\"KEYWORD2\",\"text\":\"ADD_LIBRARY\"},{\"tag\":\"KEYWORD2\",\"text\":\"ADD_SUBDIRECTORY\"},{\"tag\":\"KEYWORD2\",\"text\":\"ADD_TEST\"},{\"tag\":\"KEYWORD2\",\"text\":\"AUX_SOURCE_DIRECTORY\"},{\"tag\":\"KEYWORD2\",\"text\":\"BUILD_COMMAND\"},{\"tag\":\"KEYWORD2\",\"text\":\"BUILD_NAME\"},{\"tag\":\"KEYWORD2\",\"text\":\"CMAKE_MINIMUM_REQUIRED\"},{\"tag\":\"KEYWORD2\",\"text\":\"CONFIGURE_FILE\"},{\"tag\":\"KEYWORD2\",\"text\":\"CREATE_TEST_SOURCELIST\"},{\"tag\":\"KEYWORD2\",\"text\":\"ENABLE_LANGUAGE\"},{\"tag\":\"KEYWORD2\",\"text\":\"ENABLE_TESTING\"},{\"tag\":\"KEYWORD2\",\"text\":\"EXEC_PROGRAM\"},{\"tag\":\"KEYWORD2\",\"text\":\"EXECUTE_PROCESS\"},{\"tag\":\"KEYWORD2\",\"text\":\"EXPORT_LIBRARY_DEPENDENCIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"FILE\"},{\"tag\":\"KEYWORD2\",\"text\":\"FIND_FILE\"},{\"tag\":\"KEYWORD2\",\"text\":\"FIND_LIBRARY\"},{\"tag\":\"KEYWORD2\",\"text\":\"FIND_PACKAGE\"},{\"tag\":\"KEYWORD2\",\"text\":\"FIND_PATH\"},{\"tag\":\"KEYWORD2\",\"text\":\"FIND_PROGRAM\"},{\"tag\":\"KEYWORD2\",\"text\":\"FLTK_WRAP_UI\"},{\"tag\":\"KEYWORD2\",\"text\":\"GET_CMAKE_PROPERTY\"},{\"tag\":\"KEYWORD2\",\"text\":\"GET_DIRECTORY_PROPERTY\"},{\"tag\":\"KEYWORD2\",\"text\":\"GET_FILENAME_COMPONENT\"},{\"tag\":\"KEYWORD2\",\"text\":\"GET_SOURCE_FILE_PROPERTY\"},{\"tag\":\"KEYWORD2\",\"text\":\"GET_TARGET_PROPERTY\"},{\"tag\":\"KEYWORD2\",\"text\":\"GET_TEST_PROPERTY\"},{\"tag\":\"KEYWORD2\",\"text\":\"INCLUDE\"},{\"tag\":\"KEYWORD2\",\"text\":\"INCLUDE_DIRECTORIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"INCLUDE_EXTERNAL_MSPROJECT\"},{\"tag\":\"KEYWORD2\",\"text\":\"INCLUDE_REGULAR_EXPRESSION\"},{\"tag\":\"KEYWORD2\",\"text\":\"INSTALL\"},{\"tag\":\"KEYWORD2\",\"text\":\"INSTALL_FILES\"},{\"tag\":\"KEYWORD2\",\"text\":\"INSTALL_PROGRAMS\"},{\"tag\":\"KEYWORD2\",\"text\":\"INSTALL_TARGETS\"},{\"tag\":\"KEYWORD2\",\"text\":\"LINK_DIRECTORIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"LINK_LIBRARIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"LIST\"},{\"tag\":\"KEYWORD2\",\"text\":\"LOAD_CACHE\"},{\"tag\":\"KEYWORD2\",\"text\":\"LOAD_COMMAND\"},{\"tag\":\"KEYWORD2\",\"text\":\"MAKE_DIRECTORY\"},{\"tag\":\"KEYWORD2\",\"text\":\"MARK_AS_ADVANCED\"},{\"tag\":\"KEYWORD2\",\"text\":\"MATH\"},{\"tag\":\"KEYWORD2\",\"text\":\"MESSAGE\"},{\"tag\":\"KEYWORD2\",\"text\":\"OPTION\"},{\"tag\":\"KEYWORD2\",\"text\":\"OUTPUT_REQUIRED_FILES\"},{\"tag\":\"KEYWORD2\",\"text\":\"PROJECT\"},{\"tag\":\"KEYWORD2\",\"text\":\"QT_WRAP_CPP\"},{\"tag\":\"KEYWORD2\",\"text\":\"QT_WRAP_UI\"},{\"tag\":\"KEYWORD2\",\"text\":\"REMOVE\"},{\"tag\":\"KEYWORD2\",\"text\":\"REMOVE_DEFINITIONS\"},{\"tag\":\"KEYWORD2\",\"text\":\"SEPARATE_ARGUMENTS\"},{\"tag\":\"KEYWORD2\",\"text\":\"SET\"},{\"tag\":\"KEYWORD2\",\"text\":\"SET_DIRECTORY_PROPERTIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"SET_SOURCE_FILES_PROPERTIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"SET_TARGET_PROPERTIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"SET_TESTS_PROPERTIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"SITE_NAME\"},{\"tag\":\"KEYWORD2\",\"text\":\"SOURCE_GROUP\"},{\"tag\":\"KEYWORD2\",\"text\":\"STRING\"},{\"tag\":\"KEYWORD2\",\"text\":\"SUBDIR_DEPENDS\"},{\"tag\":\"KEYWORD2\",\"text\":\"SUBDIRS\"},{\"tag\":\"KEYWORD2\",\"text\":\"TARGET_LINK_LIBRARIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"TRY_COMPILE\"},{\"tag\":\"KEYWORD2\",\"text\":\"TRY_RUN\"},{\"tag\":\"KEYWORD2\",\"text\":\"USE_MANGLED_MESA\"},{\"tag\":\"KEYWORD2\",\"text\":\"UTILITY_SOURCE\"},{\"tag\":\"KEYWORD2\",\"text\":\"VARIABLE_REQUIRES\"},{\"tag\":\"KEYWORD2\",\"text\":\"VTK_MAKE_INSTANTIATOR\"},{\"tag\":\"KEYWORD2\",\"text\":\"VTK_WRAP_JAVA\"},{\"tag\":\"KEYWORD2\",\"text\":\"VTK_WRAP_PYTHON\"},{\"tag\":\"KEYWORD2\",\"text\":\"VTK_WRAP_TCL\"},{\"tag\":\"KEYWORD2\",\"text\":\"WRITE_FILE\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"LITERAL\",\"DEFAULT\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"${\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"MARK_FOLLOWING\",\"text\":\"$\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}