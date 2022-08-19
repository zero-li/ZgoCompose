/*
 * Copyright 2021 The Android Open Source Project
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

package androidx.compose.material3.catalog.library.ui.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Divider
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.material3.catalog.library.R
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import com.google.accompanist.insets.navigationBarsPadding

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatalogTopAppBar(
    title: String,
    showBackNavigationIcon: Boolean = false,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    onBackClick: () -> Unit = {},
    onThemeClick: () -> Unit = {},
    onGuidelinesClick: () -> Unit = {},
    onDocsClick: () -> Unit = {},
    onSourceClick: () -> Unit = {},
    onIssueClick: () -> Unit = {},
    onTermsClick: () -> Unit = {},
    onPrivacyClick: () -> Unit = {},
    onLicensesClick: () -> Unit = {}
) {
    var moreMenuExpanded by remember { mutableStateOf(false) }
    SmallTopAppBar(
        title = {
            Text(
                text = title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        actions = {
            Box {
                Row {
                    IconButton(onClick = onThemeClick) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_palette_24dp),
                            contentDescription = null
                        )
                    }
                    IconButton(onClick = { moreMenuExpanded = true }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = null
                        )
                    }
                }
                MoreMenu(
                    expanded = moreMenuExpanded,
                    onDismissRequest = { moreMenuExpanded = false },
                    onGuidelinesClick = {
                        onGuidelinesClick()
                        moreMenuExpanded = false
                    },
                    onDocsClick = {
                        onDocsClick()
                        moreMenuExpanded = false
                    },
                    onSourceClick = {
                        onSourceClick()
                        moreMenuExpanded = false
                    },
                    onIssueClick = {
                        onIssueClick()
                        moreMenuExpanded = false
                    },
                    onTermsClick = {
                        onTermsClick()
                        moreMenuExpanded = false
                    },
                    onPrivacyClick = {
                        onPrivacyClick()
                        moreMenuExpanded = false
                    },
                    onLicensesClick = {
                        onLicensesClick()
                        moreMenuExpanded = false
                    }
                )
            }
        },
        navigationIcon = {
            if (showBackNavigationIcon) {
                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null
                    )
                }
            }
        },
        scrollBehavior = scrollBehavior,
        // add zgo
        modifier = Modifier
//            .statusBarsPadding()
            .statusBarsPadding()
            .navigationBarsPadding(bottom = false)
    )
}

@Composable
private fun MoreMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    onGuidelinesClick: () -> Unit,
    onDocsClick: () -> Unit,
    onSourceClick: () -> Unit,
    onIssueClick: () -> Unit,
    onTermsClick: () -> Unit,
    onPrivacyClick: () -> Unit,
    onLicensesClick: () -> Unit,
) {
    // TODO: Replace with M3 DropdownMenu, DropdownMenuItem and Divider when available
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismissRequest
    ) {
        DropdownMenuItem(onClick = onGuidelinesClick) {
            Text(stringResource(id = R.string.view_design_guidelines))
        }
        DropdownMenuItem(onClick = onDocsClick) {
            Text(stringResource(id = R.string.view_developer_docs))
        }
        DropdownMenuItem(onClick = onSourceClick) {
            Text(stringResource(id = R.string.view_source_code))
        }
        Divider(color = MaterialTheme.colorScheme.outline)
        DropdownMenuItem(onClick = onIssueClick) {
            Text(stringResource(id = R.string.report_an_issue))
        }
        Divider(color = MaterialTheme.colorScheme.outline)
        DropdownMenuItem(onClick = onTermsClick) {
            Text(stringResource(id = R.string.terms_of_service))
        }
        DropdownMenuItem(onClick = onPrivacyClick) {
            Text(stringResource(id = R.string.privacy_policy))
        }
        DropdownMenuItem(onClick = onLicensesClick) {
            Text(stringResource(id = R.string.open_source_licenses))
        }
    }
}
