package kr.galaxyhub.sc.crawler.infra.provider

import kr.galaxyhub.sc.crawler.domain.DocumentProvider
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.stereotype.Component

@Component
class JsoupDocumentProvider : DocumentProvider {

    override fun provide(url: String): Document {
        return Jsoup.connect(url).get()
    }
}
