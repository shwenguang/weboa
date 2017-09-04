USE [master]
GO

/****** Object:  Table [dbo].[wg_disclosure_info]    Script Date: 09/04/2017 21:35:41 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

drop table wg_disclosure_info

go

CREATE TABLE [dbo].[wg_disclosure_info](
	[id] [int] NULL,
	[indv_name] [varchar](100) NULL,
	[indv_company] [varchar](100) NULL,
	[indv_cert_type] [varchar](100) NULL,
	[indv_cert_num] [varchar](100) NULL,
	[indv_link_number] [varchar](100) NULL,
	[indv_post_code] [varchar](100) NULL,
	[indv_address] [varchar](200) NULL,
	[indv_email] [varchar](50) NULL,
	[org_name] [varchar](200) NULL,
	[org_code] [varchar](100) NULL,
	[org_legal_person] [varchar](100) NULL,
	[org_link_man] [varchar](100) NULL,
	[org_link_number] [varchar](100) NULL,
	[org_post_code] [varchar](100) NULL,
	[org_address] [varchar](200) NULL,
	[org_email] [varchar](100) NULL,
	[apply_date] [date] NULL,
	[apply_type] [varchar](100) NULL,
	[info_of_gov] [varchar](200) NULL,
	[info_descriptor] [varchar](1000) NULL,
	[get_info_way] [varchar](500) NULL,
	[get_info_media] [varchar](500) NULL,
	[info_usage] [varchar](300) NULL,
	[info_usage_remark] [varchar](1000) NULL,
	[derate_expenses_reason] [varchar](1000) NULL,
	[key_word] [varchar](1000) NULL,
	[accept_no] [varchar](1000) NULL,
	[transfer_no] [varchar](100) NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


