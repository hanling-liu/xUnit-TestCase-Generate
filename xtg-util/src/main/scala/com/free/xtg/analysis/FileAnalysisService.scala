package com.free.xtg.analysis

import com.free.xtg.domain.{AnalysisResultBean, InPutFileBean}

/**
  * Created by hanling.liu on 2016/3/31.
  */
trait FileAnalysisService {

  /**
    * 文件分析
    * @param fileBean
    * @return
    */
  def fileAnalysis(fileBean:InPutFileBean) :AnalysisResultBean
}
